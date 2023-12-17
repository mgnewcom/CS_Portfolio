package newcombProdject1;

import edu.du.dudraw.DUDraw;
import newcombProdject1.sandWorld.ParticleType;

public class newcombProdject1 {

	public static void main(String[] args) {
		String toolSelect = "sand";
		DUDraw.setCanvasSize(500, 500);
		DUDraw.clear(DUDraw.BOOK_LIGHT_BLUE);
		DUDraw.setXscale(0, 500);
		DUDraw.setYscale(0, 500);
		DUDraw.enableDoubleBuffering();

		sandWorld player = new sandWorld(500, 500);
		boolean quit = false;
		// SandWorld.ParticleType.SAND;

		while (quit == false) {
			DUDraw.clear(DUDraw.LIGHT_GRAY);
			player.step();
			player.rainFall();
			player.draw();
			player.drawGround();
			player.drawRain();
			player.displayToolName(toolSelect);

			if (DUDraw.isMousePressed() == true) {
				if (toolSelect == "sand") {

					player.placeParticle((int) DUDraw.mouseX(), (int) DUDraw.mouseY(), ParticleType.SAND);

				} else if (toolSelect == "ground") { 
					//adding 6 to the circles so that sand does not leak through the floor
					for (int row = 0; row < 6; row++) {
						for (int col = 0; col < 6; col++) {
							player.placeGround((int) DUDraw.mouseX() + row, (int) DUDraw.mouseY() + col,
									ParticleType.GROUND);
						}
					}
				} else if (toolSelect == "rain") {
					player.rain((int) DUDraw.mouseX(), (int) DUDraw.mouseY(), ParticleType.RAIN);

				}

			} 
			//changes the material type depending on the material chosen
			if (DUDraw.hasNextKeyTyped()) {
				char key;
				key = DUDraw.nextKeyTyped();
				if (key == 's' || key == 'S') {
					toolSelect = "sand";
				} else if (key == 'g' || key == 'G') {
					toolSelect = "ground";
				} else if (key == 'r' || key == 'R') {
					toolSelect = "rain";
				}

			}

			DUDraw.show();
			DUDraw.pause(5);

		}

	}

}
