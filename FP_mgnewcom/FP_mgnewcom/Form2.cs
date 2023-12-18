using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FP_mgnewcom
{
    public partial class FRM_Game : Form
    {

        //variable to keep track of current turn
        private int turn = 0;
        //variables to save scores of x and O
        private double XScore = 0;
        private double OScore = 0;
        public FRM_Game()
        {
            InitializeComponent();
        }
        public void clear_board()
        {
            LBL_11.Text = "_";
            LBL_12.Text = "_";
            LBL_13.Text = "_";
            LBL_21.Text = "_";
            LBL_22.Text = "_";
            LBL_23.Text = "_";
            LBL_31.Text = "_";
            LBL_32.Text = "_";
            LBL_33.Text = "_";
        }
        private void BTN_CNFM_Click(object sender, EventArgs e)
        {
            //taking user input by checking if the numbers entered in both text boxes are either 1, 2, or 3
            string x = TB_X.Text.ToString();
            string y = TB_Y.Text.ToString();
            //if statement to checkif numbers are either 1, 2 or 3
            if ((x == "1" || x == "2" || x == "3") && (y == "1" || y == "2" || y == "3"))
            {
                //switch statement gets the x coordinate and then the if statement inside each case gets the x coordinate
                switch (x)
                {
                    //the first case is if 1 is the x coordinate
                    case "1":
                        if (y == "1")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_11.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {

                                    //the space is marked accoring to the current players turn 
                                    LBL_11.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_11.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        if (y == "2")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_12.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_12.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_12.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        if (y == "3")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_13.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_13.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_13.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        break;
                    //the second case is if 2 is the X coordinate
                    case "2":
                        if (y == "1")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_21.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_21.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_21.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        if (y == "2")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_22.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_22.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_22.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        if (y == "3")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_23.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_23.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_23.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        break;
                    //the third case is if 3 is the x coordinate
                    case "3":
                        if (y == "1")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_31.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_31.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_31.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        if (y == "2")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_32.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_32.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_32.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }
                        }
                        if (y == "3")
                        {
                            //after every turn update the turn accordingly and change the turn variable
                            if (LBL_33.Text != "_")
                            {
                                //does a check to make sure that the space has not already been taken
                                MessageBox.Show("this space has already been clained please pick a diffrent one");
                            }
                            else
                            {
                                if (turn == 0)
                                {
                                    //the space is marked accoring to the current players turn 
                                    LBL_33.Text = "X";
                                    turn = 1;
                                    //label is adjusted to display the current turn
                                    LBL_Turn.Text = "current turn is: O";
                                }
                                else
                                {
                                    LBL_33.Text = "O";
                                    turn = 0;
                                    LBL_Turn.Text = "Current turn is: X";
                                }
                            }

                        }
                        break;



                }
            }
            //if the user does not enter a 1, 2 or 3 then a message box is printed telling the user to in clude a value which is either a 1,2 or 3
            else
            {
                MessageBox.Show("please enter a number 1-3 in both of the text boxes");
            }
            //after the user picks a squere the game will immediatley check if the game has been won
            //this is done by making checking to see if any of the possible win conditions have been met or if all the spaces ahve been filled and no win condition have been met
            if (LBL_11.Text != "_" && LBL_12.Text != "_" && LBL_13.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_11.Text == "X" && LBL_12.Text == "X" && LBL_13.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_11.Text == "O" && LBL_12.Text == "O" && LBL_13.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_21.Text != "_" && LBL_22.Text != "_" && LBL_23.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_21.Text == "X" && LBL_22.Text == "X" && LBL_23.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_21.Text == "O" && LBL_22.Text == "O" && LBL_23.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_31.Text != "_" && LBL_32.Text != "_" && LBL_33.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_31.Text == "X" && LBL_32.Text == "X" && LBL_33.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_31.Text == "O" && LBL_32.Text == "O" && LBL_33.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_11.Text != "_" && LBL_21.Text != "_" && LBL_31.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_11.Text == "X" && LBL_21.Text == "X" && LBL_31.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_11.Text == "O" && LBL_21.Text == "O" && LBL_31.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_12.Text != "_" && LBL_22.Text != "_" && LBL_32.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_12.Text == "X" && LBL_22.Text == "X" && LBL_32.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_12.Text == "O" && LBL_22.Text == "O" && LBL_32.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_13.Text != "_" && LBL_23.Text != "_" && LBL_33.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_13.Text == "X" && LBL_23.Text == "X" && LBL_33.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_13.Text == "O" && LBL_23.Text == "O" && LBL_33.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_11.Text != "_" && LBL_22.Text != "_" && LBL_33.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_11.Text == "X" && LBL_22.Text == "X" && LBL_33.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_11.Text == "O" && LBL_22.Text == "O" && LBL_33.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }
            if (LBL_13.Text != "_" && LBL_22.Text != "_" && LBL_31.Text != "_")
            {
                //if the 3 in a row are X's then the x score will be adjusted by one
                if (LBL_13.Text == "X" && LBL_22.Text == "X" && LBL_31.Text == "X")
                {
                    XScore = XScore + 1;
                    LBL_XScore.Text = "X: " + XScore;
                    //board is always claeared after the game ends
                    clear_board();
                    //if the 3 in a row are O's then the O score will be adjusted by 1
                }
                else if (LBL_13.Text == "O" && LBL_22.Text == "O" && LBL_31.Text == "O")
                {
                    OScore = OScore + 1;
                    LBL_OScore.Text = "O: " + OScore;
                    //board is always cleared after the game ends
                    clear_board();
                }

            }

            //final case handles tie in which all spaces are filled but there is no clear winner 
            //the case functions by checking the gameboard to see if there is at least one space still open
            //if one space is still open then the game continues
            if (LBL_11.Text == "_" || LBL_12.Text == "_" || LBL_13.Text == "_" || LBL_21.Text == "_" || LBL_22.Text == "_" || LBL_23.Text == "_" || LBL_31.Text == "_" || LBL_32.Text == "_" || LBL_33.Text == "_")
            {




            }
            //if none of the spaces are still open then the game ends in a tie and the board is cleared with no player reciving a point
            else
            {
                //displays a message box to the user and clears the board without adjusting the score
                MessageBox.Show("Tie! No Winner!");
                clear_board();
            }

        }

        private void BTN_CLR_BRD_Click(object sender, EventArgs e)
        {
            //clear button manually resets all of the spaces
            LBL_11.Text = "_";
            LBL_12.Text = "_";
            LBL_13.Text = "_";
            LBL_21.Text = "_";
            LBL_22.Text = "_";
            LBL_23.Text = "_";
            LBL_31.Text = "_";
            LBL_32.Text = "_";
            LBL_33.Text = "_";
        }

        private void BTN_Quit_Click(object sender, EventArgs e)
        {
            //exits the game window
            Close();
        }

        private void BTN_RLS_Click(object sender, EventArgs e)
        {
            //opens up the rules form for the game screen
            FRM_RLS open_rls = new FRM_RLS();
            open_rls.Show();
        }
    }
}
