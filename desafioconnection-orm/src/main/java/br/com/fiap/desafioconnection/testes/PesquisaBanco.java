package br.com.fiap.desafioconnection.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class PesquisaBanco {

	public static void main(String[] args) {

		try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88797", "071095");
            Statement stmt = con.createStatement();
            
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do telefone: ");
        String phone = sc.next();
                    
        String q1 = "SELECT MAX(DT_TICKET) LAST_VISIT, C.NM_CLIENT NAME_CLIENT\r\n"
        		+ "FROM TB_TICKET T\r\n"
        		+ "INNER JOIN TB_CLIENT C ON T.ID_TICKET = C.ID_CLIENT\r\n"
        		+ "WHERE C.PHONE_NUMBER = '"+ phone +"'\r\n"
        		+ "GROUP BY C.NM_CLIENT";
        
        ResultSet rs = stmt.executeQuery(q1);
        if (rs.next())
        {
            System.out.println("Visita mais recente: " + rs.getString(1));
            System.out.println("Nome do Cliente" + rs.getString(2));
            
        }
        else
        {
            System.out.println("Número de telefone não cadastrado!");
        }
			
		
        con.close();
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
 }
}