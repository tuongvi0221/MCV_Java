
package model;

import java.awt.Color;

public class colorModel {
  private Color foreground; // mau chu
  private Color background;
  private boolean opaque;// co to mau vien hay khong

    public colorModel() {
        this.foreground = Color.BLACK;
        this.background = Color.WHITE;
        this.opaque = true;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public void setOpaque(boolean opaque) {
        this.opaque = opaque;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }

    public boolean isOpaque() {
        return opaque;
    }
   
}
