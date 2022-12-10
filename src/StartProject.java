/**************************************************************
* Name        : FinalProject
* Author      : Alexis Meis
* Created     : 12/9/2022
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : MAC OS Monterey
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program creates an online waitlist service
* 				for a dog boarding business.
*               Input:  first name, last name, number of pets,
*               existing client info, start date, end date
*               Output: user information stored in a list
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import javax.swing.JFrame;

public class StartProject {

	public static void main(String[] args) {
		
		JFrame frame = new WaitingListFrame();
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
