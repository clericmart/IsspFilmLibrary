package ua.martynenko.issp.group;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* ����������� ������
������� � ������� 2 ����� �����
� ������ ������� ����� �������� ���������� ������� ����� ���, ����� ���������� ����������� ������
������� ������
�������� ����� ��������� ������, �.�. �� ������� ������������� ����������� �������� ����� ���� ������
*/

public class Arr {
    public static void main(String[] args) throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	
    	FileInputStream in1 = new FileInputStream("d:/1.txt");
    	FileInputStream in = new FileInputStream("d:/2.txt");
    
    	byte[] res = new byte[0];
    	byte[] res2 = new byte[0];
    	while(in.available() > 0){
            res = new byte[in.available()];
            int count = in.read(res); // ��� ��� �������� ��� ���������� � ������?
        } in.close();
    	while(in1.available() > 0){
            res2 = new byte[in1.available()];
            int count = in1.read(res2);
        } in1.close();
        
        FileOutputStream out = new FileOutputStream("d:/1.txt");
        out.close();
    	FileOutputStream out1 = new FileOutputStream("d:/1.txt", true);
    	
    	for (int i = 0; i < res.length; i++) {
			out1.write(res[i]);
		}
    	for (int i = 0; i < res2.length; i++) {
    		out1.write(res2[i]);
		}
    	out1.close();
    }
}