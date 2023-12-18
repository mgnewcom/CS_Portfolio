using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FP_mgnewcom
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void BTN_GM_Click(object sender, EventArgs e)
        {
            //opens up a new form where the actual ic tac toe game is played 
            FRM_Game play_game = new FRM_Game();
            play_game.Show();
        }

        private void BTN_RUL_Click(object sender, EventArgs e)
        {
            //opens up a new form that shows the rules
            FRM_RLS open_rules = new FRM_RLS();
            open_rules.Show();
        }
    }
}
