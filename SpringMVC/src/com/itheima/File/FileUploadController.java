package com.itheima.File;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileUpload")
	public String handleFormUpload(@RequestParam("name")String name,@RequestParam("uploadfile")List<MultipartFile> uploadFile,
			HttpServletRequest request) {
		if(!uploadFile.isEmpty() && uploadFile.size()>0) {
			for(MultipartFile file:uploadFile) {
				// ��ȡ�ϴ��ļ���ԭʼ����
				String originalFilename=file.getOriginalFilename();
				// �����ϴ��ļ��ı����ַĿ¼
				String dirPath=request.getServletContext().getRealPath("/upload/");
				File filePath=new File(dirPath);
				if(!filePath.exists())
					filePath.mkdirs();
				// �������ļ�
				String newFilename=name+"_"+UUID.randomUUID()+"_"+originalFilename;
				try {
					file.transferTo(new File(dirPath+newFilename));
				}catch (Exception e) {
					e.printStackTrace();
					return "error";
				}
			}
			return "success";
		}else {
			return "error";
		}
	}
}
