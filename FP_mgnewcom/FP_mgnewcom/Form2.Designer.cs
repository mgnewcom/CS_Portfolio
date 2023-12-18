namespace FP_mgnewcom
{
    partial class FRM_Game
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.BTN_CNFM = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.TB_X = new System.Windows.Forms.TextBox();
            this.TB_Y = new System.Windows.Forms.TextBox();
            this.LBL_Turn = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.LBL_XScore = new System.Windows.Forms.Label();
            this.LBL_OScore = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.LBL_13 = new System.Windows.Forms.Label();
            this.LBL_23 = new System.Windows.Forms.Label();
            this.LBL_33 = new System.Windows.Forms.Label();
            this.LBL_12 = new System.Windows.Forms.Label();
            this.LBL_22 = new System.Windows.Forms.Label();
            this.LBL_32 = new System.Windows.Forms.Label();
            this.LBL_11 = new System.Windows.Forms.Label();
            this.LBL_21 = new System.Windows.Forms.Label();
            this.LBL_31 = new System.Windows.Forms.Label();
            this.label15 = new System.Windows.Forms.Label();
            this.label16 = new System.Windows.Forms.Label();
            this.label17 = new System.Windows.Forms.Label();
            this.label18 = new System.Windows.Forms.Label();
            this.label19 = new System.Windows.Forms.Label();
            this.label20 = new System.Windows.Forms.Label();
            this.BTN_CLR_BRD = new System.Windows.Forms.Button();
            this.BTN_Quit = new System.Windows.Forms.Button();
            this.BTN_RLS = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(13, 44);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(17, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "X:";
            // 
            // BTN_CNFM
            // 
            this.BTN_CNFM.Location = new System.Drawing.Point(16, 126);
            this.BTN_CNFM.Name = "BTN_CNFM";
            this.BTN_CNFM.Size = new System.Drawing.Size(75, 23);
            this.BTN_CNFM.TabIndex = 1;
            this.BTN_CNFM.Text = "Confirm";
            this.BTN_CNFM.UseVisualStyleBackColor = true;
            this.BTN_CNFM.Click += new System.EventHandler(this.BTN_CNFM_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(13, 70);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(17, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Y:";
            // 
            // TB_X
            // 
            this.TB_X.Location = new System.Drawing.Point(36, 44);
            this.TB_X.Name = "TB_X";
            this.TB_X.Size = new System.Drawing.Size(100, 20);
            this.TB_X.TabIndex = 3;
            // 
            // TB_Y
            // 
            this.TB_Y.Location = new System.Drawing.Point(36, 70);
            this.TB_Y.Name = "TB_Y";
            this.TB_Y.Size = new System.Drawing.Size(100, 20);
            this.TB_Y.TabIndex = 4;
            // 
            // LBL_Turn
            // 
            this.LBL_Turn.AutoSize = true;
            this.LBL_Turn.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_Turn.Location = new System.Drawing.Point(16, 206);
            this.LBL_Turn.Name = "LBL_Turn";
            this.LBL_Turn.Size = new System.Drawing.Size(141, 24);
            this.LBL_Turn.TabIndex = 5;
            this.LBL_Turn.Text = "Current Turn: X";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(20, 250);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(63, 20);
            this.label3.TabIndex = 6;
            this.label3.Text = "Scores:";
            // 
            // LBL_XScore
            // 
            this.LBL_XScore.AutoSize = true;
            this.LBL_XScore.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_XScore.Location = new System.Drawing.Point(24, 290);
            this.LBL_XScore.Name = "LBL_XScore";
            this.LBL_XScore.Size = new System.Drawing.Size(25, 15);
            this.LBL_XScore.TabIndex = 7;
            this.LBL_XScore.Text = "X:_";
            // 
            // LBL_OScore
            // 
            this.LBL_OScore.AutoSize = true;
            this.LBL_OScore.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_OScore.Location = new System.Drawing.Point(90, 292);
            this.LBL_OScore.Name = "LBL_OScore";
            this.LBL_OScore.Size = new System.Drawing.Size(26, 15);
            this.LBL_OScore.TabIndex = 8;
            this.LBL_OScore.Text = "O:_";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(290, 186);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(17, 13);
            this.label4.TabIndex = 9;
            this.label4.Text = "Y:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(381, 274);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(17, 13);
            this.label5.TabIndex = 10;
            this.label5.Text = "X:";
            // 
            // LBL_13
            // 
            this.LBL_13.AutoSize = true;
            this.LBL_13.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_13.Location = new System.Drawing.Point(330, 137);
            this.LBL_13.Name = "LBL_13";
            this.LBL_13.Size = new System.Drawing.Size(24, 25);
            this.LBL_13.TabIndex = 11;
            this.LBL_13.Text = "_";
            // 
            // LBL_23
            // 
            this.LBL_23.AutoSize = true;
            this.LBL_23.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_23.Location = new System.Drawing.Point(379, 137);
            this.LBL_23.Name = "LBL_23";
            this.LBL_23.Size = new System.Drawing.Size(24, 25);
            this.LBL_23.TabIndex = 12;
            this.LBL_23.Text = "_";
            // 
            // LBL_33
            // 
            this.LBL_33.AutoSize = true;
            this.LBL_33.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_33.Location = new System.Drawing.Point(428, 137);
            this.LBL_33.Name = "LBL_33";
            this.LBL_33.Size = new System.Drawing.Size(24, 25);
            this.LBL_33.TabIndex = 13;
            this.LBL_33.Text = "_";
            // 
            // LBL_12
            // 
            this.LBL_12.AutoSize = true;
            this.LBL_12.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_12.Location = new System.Drawing.Point(330, 177);
            this.LBL_12.Name = "LBL_12";
            this.LBL_12.Size = new System.Drawing.Size(24, 25);
            this.LBL_12.TabIndex = 14;
            this.LBL_12.Text = "_";
            // 
            // LBL_22
            // 
            this.LBL_22.AutoSize = true;
            this.LBL_22.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_22.Location = new System.Drawing.Point(379, 177);
            this.LBL_22.Name = "LBL_22";
            this.LBL_22.Size = new System.Drawing.Size(24, 25);
            this.LBL_22.TabIndex = 15;
            this.LBL_22.Text = "_";
            // 
            // LBL_32
            // 
            this.LBL_32.AutoSize = true;
            this.LBL_32.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_32.Location = new System.Drawing.Point(428, 177);
            this.LBL_32.Name = "LBL_32";
            this.LBL_32.Size = new System.Drawing.Size(24, 25);
            this.LBL_32.TabIndex = 16;
            this.LBL_32.Text = "_";
            // 
            // LBL_11
            // 
            this.LBL_11.AutoSize = true;
            this.LBL_11.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_11.Location = new System.Drawing.Point(330, 216);
            this.LBL_11.Name = "LBL_11";
            this.LBL_11.Size = new System.Drawing.Size(24, 25);
            this.LBL_11.TabIndex = 17;
            this.LBL_11.Text = "_";
            // 
            // LBL_21
            // 
            this.LBL_21.AutoSize = true;
            this.LBL_21.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_21.Location = new System.Drawing.Point(379, 216);
            this.LBL_21.Name = "LBL_21";
            this.LBL_21.Size = new System.Drawing.Size(24, 25);
            this.LBL_21.TabIndex = 18;
            this.LBL_21.Text = "_";
            // 
            // LBL_31
            // 
            this.LBL_31.AutoSize = true;
            this.LBL_31.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LBL_31.Location = new System.Drawing.Point(428, 216);
            this.LBL_31.Name = "LBL_31";
            this.LBL_31.Size = new System.Drawing.Size(24, 25);
            this.LBL_31.TabIndex = 19;
            this.LBL_31.Text = "_";
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(313, 225);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(13, 13);
            this.label15.TabIndex = 20;
            this.label15.Text = "1";
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(313, 186);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(13, 13);
            this.label16.TabIndex = 21;
            this.label16.Text = "2";
            // 
            // label17
            // 
            this.label17.AutoSize = true;
            this.label17.Location = new System.Drawing.Point(311, 146);
            this.label17.Name = "label17";
            this.label17.Size = new System.Drawing.Size(13, 13);
            this.label17.TabIndex = 22;
            this.label17.Text = "3";
            // 
            // label18
            // 
            this.label18.AutoSize = true;
            this.label18.Location = new System.Drawing.Point(332, 250);
            this.label18.Name = "label18";
            this.label18.Size = new System.Drawing.Size(13, 13);
            this.label18.TabIndex = 23;
            this.label18.Text = "1";
            // 
            // label19
            // 
            this.label19.AutoSize = true;
            this.label19.Location = new System.Drawing.Point(381, 250);
            this.label19.Name = "label19";
            this.label19.Size = new System.Drawing.Size(13, 13);
            this.label19.TabIndex = 24;
            this.label19.Text = "2";
            // 
            // label20
            // 
            this.label20.AutoSize = true;
            this.label20.Location = new System.Drawing.Point(430, 250);
            this.label20.Name = "label20";
            this.label20.Size = new System.Drawing.Size(13, 13);
            this.label20.TabIndex = 25;
            this.label20.Text = "3";
            // 
            // BTN_CLR_BRD
            // 
            this.BTN_CLR_BRD.Location = new System.Drawing.Point(703, 344);
            this.BTN_CLR_BRD.Name = "BTN_CLR_BRD";
            this.BTN_CLR_BRD.Size = new System.Drawing.Size(75, 23);
            this.BTN_CLR_BRD.TabIndex = 26;
            this.BTN_CLR_BRD.Text = "Clear Board";
            this.BTN_CLR_BRD.UseVisualStyleBackColor = true;
            this.BTN_CLR_BRD.Click += new System.EventHandler(this.BTN_CLR_BRD_Click);
            // 
            // BTN_Quit
            // 
            this.BTN_Quit.Location = new System.Drawing.Point(703, 373);
            this.BTN_Quit.Name = "BTN_Quit";
            this.BTN_Quit.Size = new System.Drawing.Size(75, 23);
            this.BTN_Quit.TabIndex = 27;
            this.BTN_Quit.Text = "Quit";
            this.BTN_Quit.UseVisualStyleBackColor = true;
            this.BTN_Quit.Click += new System.EventHandler(this.BTN_Quit_Click);
            // 
            // BTN_RLS
            // 
            this.BTN_RLS.Location = new System.Drawing.Point(703, 403);
            this.BTN_RLS.Name = "BTN_RLS";
            this.BTN_RLS.Size = new System.Drawing.Size(75, 23);
            this.BTN_RLS.TabIndex = 28;
            this.BTN_RLS.Text = "View Rules";
            this.BTN_RLS.UseVisualStyleBackColor = true;
            this.BTN_RLS.Click += new System.EventHandler(this.BTN_RLS_Click);
            // 
            // FRM_Game
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Info;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.BTN_RLS);
            this.Controls.Add(this.BTN_Quit);
            this.Controls.Add(this.BTN_CLR_BRD);
            this.Controls.Add(this.label20);
            this.Controls.Add(this.label19);
            this.Controls.Add(this.label18);
            this.Controls.Add(this.label17);
            this.Controls.Add(this.label16);
            this.Controls.Add(this.label15);
            this.Controls.Add(this.LBL_31);
            this.Controls.Add(this.LBL_21);
            this.Controls.Add(this.LBL_11);
            this.Controls.Add(this.LBL_32);
            this.Controls.Add(this.LBL_22);
            this.Controls.Add(this.LBL_12);
            this.Controls.Add(this.LBL_33);
            this.Controls.Add(this.LBL_23);
            this.Controls.Add(this.LBL_13);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.LBL_OScore);
            this.Controls.Add(this.LBL_XScore);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.LBL_Turn);
            this.Controls.Add(this.TB_Y);
            this.Controls.Add(this.TB_X);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.BTN_CNFM);
            this.Controls.Add(this.label1);
            this.Name = "FRM_Game";
            this.Text = "Form2";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button BTN_CNFM;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox TB_X;
        private System.Windows.Forms.TextBox TB_Y;
        private System.Windows.Forms.Label LBL_Turn;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label LBL_XScore;
        private System.Windows.Forms.Label LBL_OScore;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label LBL_13;
        private System.Windows.Forms.Label LBL_23;
        private System.Windows.Forms.Label LBL_33;
        private System.Windows.Forms.Label LBL_12;
        private System.Windows.Forms.Label LBL_22;
        private System.Windows.Forms.Label LBL_32;
        private System.Windows.Forms.Label LBL_11;
        private System.Windows.Forms.Label LBL_21;
        private System.Windows.Forms.Label LBL_31;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.Label label17;
        private System.Windows.Forms.Label label18;
        private System.Windows.Forms.Label label19;
        private System.Windows.Forms.Label label20;
        private System.Windows.Forms.Button BTN_CLR_BRD;
        private System.Windows.Forms.Button BTN_Quit;
        private System.Windows.Forms.Button BTN_RLS;
    }
}