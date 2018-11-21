package com.warcraft.controller;
import java.io.File;
import java.util.Date;
import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping("/file/")
public class LoginController {
	
	@RequestMapping("ajaxTest")
    @ResponseBody
    public  String ajaxTest(MultipartFile xinghua){
        String newName=null;
        try {
            
            //获取图片名字
            String oldName=xinghua.getOriginalFilename();
            newName=UUID.randomUUID().toString()+new Date().getTime();
            newName+=oldName.substring(oldName.lastIndexOf("."));
            File dest=new File("D:\\Depository\\"+newName);
            System.out.println(dest);
            xinghua.transferTo(dest);//上传文件
           
        }catch (Exception e){
            e.printStackTrace();
        }
        return "{'fileName':'" + newName + "'}";
    }
	/*@RequestMapping("upload")
	public String upload(MultipartFile xinghua) throws IllegalStateException, IOException{
	  //保存数据库的路径
	  String sqlPath = null; 
	  //定义文件保存的本地路径
      String localPath="D:\\Depository\\";
      //定义 文件名
        
      
          //生成uuid作为文件名称  
      	 String newName=UUID.randomUUID().toString()+new Date().getTime();  
      	if (newName.lastIndexOf("\\") > -1)
        {
            newName = newName.substring(newName.lastIndexOf("\\") + 1);
        }
      	String type = newName.substring(newName.lastIndexOf(".") + 1);//得到加载文件的扩展名
           
          
          //得到 文件名
          newName=newName+"."+type; 
          //文件保存路径
          xinghua.transferTo(new File(localPath+newName));  
      //把图片的相对路径保存至数据库
      sqlPath = "/"+newName;
      System.out.println(sqlPath);
      menuInfo.setDietPicture(sqlPath);
      menuInfoSerivce.insertDiet(menuInfo);
      return "{'fileName':'" + newName + "'}";
	}*/
}
