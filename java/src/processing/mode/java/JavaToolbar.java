/*
  Part of the Processing project - http://processing.org

  Copyright (c) 2010-11 Ben Fry and Casey Reas

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License version 2
  as published by the Free Software Foundation.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software Foundation,
  Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package processing.mode.java;

import java.awt.Image;
import java.awt.event.MouseEvent;

//import javax.swing.JPopupMenu;


import javax.swing.JPanel;

import processing.app.Base;
import processing.app.Editor;
import processing.app.EditorToolbar;
import processing.app.Language;


public class JavaToolbar extends EditorToolbar {
  
  public JavaToolbar(Editor editor) {
    super(editor);
  }
}


/*
public class JavaToolbar extends EditorToolbar {
  static protected final int RUN    = 0;
  static protected final int STOP   = 1;

  
  public JavaToolbar(Editor editor, Base base) {
    super(editor, base);
  }


  public void init() {
    Image[][] images = loadImages();
    for (int i = 0; i < 2; i++) {
      addButton(getTitle(i, false), getTitle(i, true), images[i], false);
    }
  }


  static public String getTitle(int index, boolean shift) {
    switch (index) {
    case RUN: return !shift ? Language.text("toolbar.run") : Language.text("toolbar.present");
    case STOP: return Language.text("toolbar.stop");
    }
    return null;
  }


  public void handlePressed(MouseEvent e, int sel) {
    boolean shift = e.isShiftDown();
    JavaEditor jeditor = (JavaEditor) editor;

    switch (sel) {
    case RUN:
      if (shift) {
        jeditor.handlePresent();
      } else {
        jeditor.handleRun();
      }
      break;

    case STOP:
      jeditor.handleStop();
      break;
    }
  }
}
*/