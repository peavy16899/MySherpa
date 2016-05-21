package sherpa;

import java.io.File;

public class FileTree {
	public static void main(String[] args) {
		File f = new File("D:/1005班");
		File f2 = new File("D:/1005班/学生成绩/学生分数");
		if(!f2.exists()){
			f2.mkdirs();
		}
		printFile(f, 0);
	}
	
	static void printFile(File file, int level){
		for(int i = 0; i<level; i++){
			System.out.print("-");
			}
		System.out.println(file.getName());
		
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File temp:files){
				printFile(temp, level+1);
			}
		}
	}
}
