package com.warcraft.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.warcraft.common.vo.JsonResult;

@Controller
public class PageController {
	@RequestMapping("/index")
	public String pageIndex(){
		return "starter";
	}
	
	@RequestMapping("buyerIndex")
	public String buyerIndex(){
		return "sys/BuyerManager_list";
	}
	
	@RequestMapping("doPageUI")
	public String doPageUI(){
		return "common/page";
	}
	
	@RequestMapping("bossIndex")
	public String bossIndex(){
		return "sys/BossManager_list";
	}
	
	@RequestMapping("storeIndex")
	public String storeIndex(){
		return "sys/StoreManager_list";
	}
	
	@RequestMapping("delivererIndex")
	public String delivererIndex(){
		return "sys/DelivererManager_list";
	}
	
	@RequestMapping("indentIndex")
	public String indentIndex(){
		return "sys/IndentManager_list";
	}
	
	@RequestMapping("dataBack")
	@ResponseBody
	public JsonResult DataBack(){
		try {  
            if (PageController.exportDatabaseTool( "localhost","root", "123456", "E:", "test.sql", "warcraft")) {  
                System.out.println("数据库成功备份！！！");  
            } else {  
                System.out.println("数据库备份失败！！！");  
            }  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }
		return new JsonResult("ok");
	}
	/** 
     * Java代码实现MySQL数据库导出 
     *  
     * @author 
     * @param userName 进入数据库所需要的用户名 
     * @param password 进入数据库所需要的密码 
     * @param savePath 数据库导出文件保存路径 
     * @param fileName 数据库导出文件文件名 
     * @param databaseName 要导出的数据库名 
     * @return 返回true表示导出成功，否则返回false。 
     */  
    public static boolean exportDatabaseTool(String hostIP, String userName, String password, String savePath, String fileName, String databaseName) throws InterruptedException {  
        File saveFile = new File(savePath);  
        if (!saveFile.exists()) {// 如果目录不存在  
            saveFile.mkdirs();// 创建文件夹  
        }  
        if(!savePath.endsWith(File.separator)){  
            savePath = savePath + File.separator;  
        }  
          
        PrintWriter printWriter = null;  
        BufferedReader bufferedReader = null;  
        try {  
            printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(savePath + fileName), "utf8"));  
            Process process = Runtime.getRuntime().exec("C:\\Program Files (x86)\\MySQL\\MySQL Server 5.5\\bin\\mysqldump.exe -h" + hostIP
            		+ " -u" + userName + " -p" + password + " --set-charset=UTF8 " + databaseName);  
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream(), "utf8");  
            bufferedReader = new BufferedReader(inputStreamReader);  
            String line;  
            while((line = bufferedReader.readLine())!= null){  
                printWriter.println(line);  
            }  
            printWriter.flush();  
            if(process.waitFor() == 0){//0 表示线程正常终止。  
                return true;  
            }  
        }catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (bufferedReader != null) {  
                    bufferedReader.close();  
                }  
                if (printWriter != null) {  
                    printWriter.close();  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        return false;  
        }
	
}
