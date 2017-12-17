/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib2017.richclient;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import lib2017.richclient.controller.ExitAction;
import lib2017.richclient.view.BookPane;
import lib2017.richclient.view.LibMenuBar;
import lib2017.richclient.view.LibToolBar;
import lib2017.utils.LibException;
import lib2017.utils.Messages;

/**
 *
 * @author danecek
 */
public class MainWindow extends Application {

    public static MainWindow instance;

    public static void error(LibException ex) {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.resizableProperty().set(true);
        a.setContentText(ex.getMessage());
        a.showAndWait();
    }

    public static void main(String[] args) {
      launch(args);
    }
    BookPane bookPane;
    LibMenuBar libMenuBar;

   // @Override
    public void start(Stage primaryStage) {
        instance = this;
        primaryStage.setTitle(Messages.Library.getMessage());
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                ExitAction.instance.execute();
            }
        });
        bookPane = new BookPane();
        Parent root = new VBox(libMenuBar = new LibMenuBar(), new LibToolBar(), bookPane);
        Scene s = new Scene(root, 800, 400);
        primaryStage.setScene(s);
        primaryStage.show();
        try {
            bookPane.refresh();
        } catch (LibException ex) {
            error(ex);
            //           Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public MainWindow() {


    }

    public BookPane getBookPane() {
        return bookPane;
    }
    
    public void addMenu(Menu menu) {
        libMenuBar.getMenus().add(menu);
    }
}
