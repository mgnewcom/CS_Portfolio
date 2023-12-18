namespace FP_mgnewcom
{
    partial class Form1
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
            this.BTN_GM = new System.Windows.Forms.Button();
            this.BTN_RUL = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(47, 79);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(324, 37);
            this.label1.TabIndex = 0;
            this.label1.Text = "welcome to tic tac toe";
            // 
            // BTN_GM
            // 
            this.BTN_GM.Location = new System.Drawing.Point(54, 205);
            this.BTN_GM.Name = "BTN_GM";
            this.BTN_GM.Size = new System.Drawing.Size(104, 39);
            this.BTN_GM.TabIndex = 1;
            this.BTN_GM.Text = "Play Game";
            this.BTN_GM.UseVisualStyleBackColor = true;
            this.BTN_GM.Click += new System.EventHandler(this.BTN_GM_Click);
            // 
            // BTN_RUL
            // 
            this.BTN_RUL.Location = new System.Drawing.Point(267, 205);
            this.BTN_RUL.Name = "BTN_RUL";
            this.BTN_RUL.Size = new System.Drawing.Size(104, 39);
            this.BTN_RUL.TabIndex = 2;
            this.BTN_RUL.Text = "View Rules";
            this.BTN_RUL.UseVisualStyleBackColor = true;
            this.BTN_RUL.Click += new System.EventHandler(this.BTN_RUL_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Info;
            this.ClientSize = new System.Drawing.Size(423, 342);
            this.Controls.Add(this.BTN_RUL);
            this.Controls.Add(this.BTN_GM);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button BTN_GM;
        private System.Windows.Forms.Button BTN_RUL;
    }
}

