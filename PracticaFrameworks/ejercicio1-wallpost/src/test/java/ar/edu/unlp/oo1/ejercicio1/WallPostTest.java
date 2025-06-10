package ar.edu.unlp.oo1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.oo1.ejercicio1.app.JSONFormatter;
import ar.edu.unlp.oo1.ejercicio1.app.MayusFormatter;
import ar.edu.unlp.oo1.ejercicio1.impl.WallPost;
import ar.edu.unlp.oo1.ejercicio1.impl.WallPostImpl;
import ar.edu.unlp.oo1.ejercicio1.ui.WallPostUI;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * A WallpostTest is a test class for testing the behavior of Wallpost
 */
class WallPostTest {
  WallPost wallPost;
  WallPost coolPost;
  

  @BeforeEach
  void setUp() throws Exception {
	Logger modelLogger = Logger.getLogger(WallPostImpl.class.getName());
	Logger modelLogger2 = Logger.getLogger(WallPostUI.class.getName());
    if (modelLogger.getHandlers().length == 0) { // Evita duplicar handlers
    	
    	//configuro el modelLogger para MAYUSFORMATTER
        FileHandler handler = new FileHandler("model.log", true);
        handler.setFormatter(new MayusFormatter());
        modelLogger.addHandler(handler);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new MayusFormatter());
        modelLogger.addHandler(consoleHandler);
        
        //configuro el modelLogger para MAYUSFORMATTER
        FileHandler handler2 = new FileHandler("model.log", true);
        handler.setFormatter(new JSONFormatter());
        modelLogger2.addHandler(handler);
        ConsoleHandler consoleHandler2 = new ConsoleHandler();
        consoleHandler2.setFormatter(new MayusFormatter());
        modelLogger2.addHandler(consoleHandler);
        
        //configuro el modelLogger2
        /*FileHandler handler2 = new FileHandler("model.log", true);
        handler2.setFormatter(new SimpleFormatter());
        modelLogger2.addHandler(handler2);
        ConsoleHandler consoleHandler2 = new ConsoleHandler();
        consoleHandler2.setFormatter(new MayusFormatter());
        modelLogger.addHandler(consoleHandler2);*/
        
        modelLogger.setUseParentHandlers(false);
	}
    wallPost = new WallPostImpl();
    coolPost = new WallPostImpl();
    coolPost.like();
    coolPost.like();
    coolPost.like();
    coolPost.like();
    coolPost.toggleFeatured();
  }

  @Test
  void testCreation() {
    assertEquals("Undefined post", wallPost.getText());
    assertEquals(0, wallPost.getLikes());
    assertEquals(false, wallPost.isFeatured());
  }

  @Test
  void testDislike() {
    coolPost.dislike();
    assertEquals(3, coolPost.getLikes());
    coolPost.dislike();
    coolPost.dislike();
    assertEquals(1, coolPost.getLikes());
    coolPost.dislike();
    assertEquals(0, coolPost.getLikes());
    coolPost.dislike();
    assertEquals(0, coolPost.getLikes());
  }
  
  @Test
  void testFeatured() {
    assertFalse(wallPost.isFeatured());
  }

  @Test
  void testLike() {
    assertEquals(0, wallPost.getLikes());
    wallPost.like();
    assertEquals(1, wallPost.getLikes());
    wallPost.like();
    wallPost.like();
    wallPost.like();
    assertEquals(4, wallPost.getLikes());
    wallPost.like();
    wallPost.like();
    wallPost.like();
    wallPost.like();
    wallPost.like();
    wallPost.like();
  }

  @Test
  void testText() {
    final String hello = "Hello";
    wallPost.setText(hello);
    assertEquals(hello, wallPost.getText());

    final String bye = "Bye";
    wallPost.setText(bye);
    assertEquals(bye, wallPost.getText());
  }

  @Test
  void testToggleFeatured() {
	wallPost.toggleFeatured();
    assertTrue(wallPost.isFeatured());
    coolPost.toggleFeatured();
    assertFalse(coolPost.isFeatured());
  }

  @Test
  void testWallpost() {
    assertEquals(0, wallPost.getLikes());
  }

}
