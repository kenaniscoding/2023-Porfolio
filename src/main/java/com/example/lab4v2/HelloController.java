package com.example.lab4v2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class HelloController {

    @FXML
    public Label label1 = new Label();
    @FXML
    public Label label2 = new Label();
    @FXML
    public Label label3 = new Label();
    @FXML
    public Label label4 = new Label();
    @FXML
    public Label titleL = new Label();
    @FXML
    public Label dateL = new Label();
    @FXML
    public ImageView image1;
    @FXML
    public ImageView image2;
    @FXML
    public ImageView image3;
    @FXML
    public ImageView image4;
    public static MyLinkedList<Slide> list;
    public static boolean bool=true;
    private int ix=0;

    @FXML
    public void exit() {
        Platform.exit();
    }
    public void setTitleL(String label){
        titleL.setText(label);
    }
    public void setDateL(String label){
        dateL.setText(label);
    }
    public void setLabel1(String label){
        label1.setText(label);
    }
    public void setLabel2(String label){
        label2.setText(label);
    }
    public void setLabel3(String label){
        label3.setText(label);
    }
    public void setLabel4(String label){
        label4.setText(label);
    }
    public void setImage1(String label){
        Image image = new Image("C:\\Users\\Kenan\\Documents\\DLSU Files\\4th Term\\LBYCPA2\\Lab4v2\\src\\main\\resources\\com\\example\\lab4v2\\Pictures\\"+label);
        image1.setImage(image);
    }
    public void setImage2(String label){
        Image image = new Image("C:\\Users\\Kenan\\Documents\\DLSU Files\\4th Term\\LBYCPA2\\Lab4v2\\src\\main\\resources\\com\\example\\lab4v2\\Pictures\\"+label);
        image2.setImage(image);
    }
    public void setImage3(String label){
        Image image = new Image("C:\\Users\\Kenan\\Documents\\DLSU Files\\4th Term\\LBYCPA2\\Lab4v2\\src\\main\\resources\\com\\example\\lab4v2\\Pictures\\"+label);
        image3.setImage(image);
    }
    public void setImage4(String label){
        Image image = new Image("C:\\Users\\Kenan\\Documents\\DLSU Files\\4th Term\\LBYCPA2\\Lab4v2\\src\\main\\resources\\com\\example\\lab4v2\\Pictures\\"+label);
        image4.setImage(image);
    }
    @FXML
    public void loadMenu(ActionEvent e){
        HelloApplication app = new HelloApplication();
        try {
            app.changeScene("Menu.fxml");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    @FXML
    public void slideShow(ActionEvent e) {
        if (bool){ //load My list of with data type of Slide
            readMyList();
            bool=false;
        }
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        HelloApplication app = new HelloApplication();
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
                        try {
                            app.getStage().getScene().setRoot(loader.load());
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        HelloController controller = loader.getController();
                        changeController(controller,ix++);
                    }
                });
                if (ix>=8-1){
                    timer.cancel();
                    timer.purge();
                }
            }
        }, 0,2000);
    }

    @FXML
    public void Capstone() throws IOException {
        if (bool){
            readMyList();
            bool=false;
        }
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        //change the label text and image
        controller.setTitleL(list.peekFirst().getTitle());
        controller.setDateL(list.peekFirst().getDate());
        controller.setLabel1(list.peekFirst().getLabel1());
        controller.setLabel2(list.peekFirst().getLabel2());
        controller.setLabel3(list.peekFirst().getLabel3());
        controller.setLabel4(list.peekFirst().getLabel4());
        controller.setImage1(list.peekFirst().getImage1());
        controller.setImage2(list.peekFirst().getImage2());
        controller.setImage3(list.peekFirst().getImage3());
        controller.setImage4(list.peekFirst().getImage4());
    }
    @FXML
    public void Hangman() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        int i=1;
        changeController(controller,i);
    }
    @FXML
    public void Pokemon() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        int i=2;
        changeController(controller,i);
    }
    @FXML
    public void SocialNet() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        int i=3;
        changeController(controller,i);
    }
    @FXML
    public void Chess() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        int i=4;
        changeController(controller,i);
    }
    @FXML
    public void ThesisCollect() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        int i=5;
        changeController(controller,i);
    }
    @FXML
    public void Work() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        int i=6;
        changeController(controller,i);
    }
    @FXML
    public void Education() throws IOException {
        HelloApplication app = new HelloApplication();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResearchPaper.fxml"));
        app.getStage().getScene().setRoot(loader.load());
        HelloController controller = loader.getController();
        controller.setTitleL(list.peekLast().getTitle());
        controller.setDateL(list.peekLast().getDate());
        controller.setLabel1(list.peekLast().getLabel1());
        controller.setLabel2(list.peekLast().getLabel2());
        controller.setLabel3(list.peekLast().getLabel3());
        controller.setLabel4(list.peekLast().getLabel4());
        controller.setImage1(list.peekLast().getImage1());
        controller.setImage2(list.peekLast().getImage2());
        controller.setImage3(list.peekLast().getImage3());
        controller.setImage4(list.peekLast().getImage4());
    }
    public void changeController(HelloController controller, int i){
        controller.setTitleL(list.peekBetween(i).getTitle());
        controller.setDateL(list.peekBetween(i).getDate());
        controller.setLabel1(list.peekBetween(i).getLabel1());
        controller.setLabel2(list.peekBetween(i).getLabel2());
        controller.setLabel3(list.peekBetween(i).getLabel3());
        controller.setLabel4(list.peekBetween(i).getLabel4());
        controller.setImage1(list.peekBetween(i).getImage1());
        controller.setImage2(list.peekBetween(i).getImage2());
        controller.setImage3(list.peekBetween(i).getImage3());
        controller.setImage4(list.peekBetween(i).getImage4());
    }
    public void readMyList(){
        list = new MyLinkedList<>();
        Slide research = new Slide();
        research.setDate("2021");
        research.setTitle("Capstone/Research Paper:");
        research.setLabel1("KINETIC ENERGY HARVESTING IN VEHICULAR");
        research.setLabel2("TRAFFIC THROUGH RUMBLE STRIPS");
        research.setLabel3("A rumble strip diagram was designed together");
        research.setLabel4("with the help of two mechanical engineer");
        research.setImage1("capstone1.png");
        research.setImage2("capstone2.png");
        research.setImage3("capstone3.png");
        research.setImage4("capstone4.png");

        list.pushLast(research);
        Slide hangman = new Slide();
        hangman.setTitle("Hangman.java");
        hangman.setDate("2022");
        hangman.setLabel1("A Java Hangman Program using ACM graphics");
        hangman.setLabel2("and arrays. There are two kinds which are");
        hangman.setLabel3("the ASCII art and ACM graphics");
        hangman.setLabel4("Note that there are 7 lives");
        hangman.setImage1("hangman1.png");
        hangman.setImage2("hangman5.png");
        hangman.setImage3("hangman3.png");
        hangman.setImage4("hangman4.png");

        list.pushLast(hangman);
        Slide pokemon = new Slide();
        pokemon.setTitle("Pokemon.java");
        pokemon.setDate("2022");
        pokemon.setLabel1("A Java program using GUI ");
        pokemon.setLabel2("and ACM graphics with ArrayList");
        pokemon.setLabel3("Add, Remove, Search, Slideshow of Pokemon,");
        pokemon.setLabel4("and Show random Pokemon");
        pokemon.setImage1("pokemon1.png");
        pokemon.setImage2("pokemon3.png");
        pokemon.setImage3("pokemon4.png");
        pokemon.setImage4("pokemon5.png");

        list.pushLast(pokemon);
        Slide socialnet = new Slide();
        socialnet.setTitle("SocialNet.java");
        socialnet.setDate("2022");
        socialnet.setLabel1("A Java program using GUI and ArrayList");
        socialnet.setLabel2("The methods include add, delete, lookup Profile");
        socialnet.setLabel3("change status, picture, add, remove friend");
        socialnet.setLabel4("and change quote in a FXML file");
        socialnet.setImage1("socialnet1.png");
        socialnet.setImage2("socialnet2.png");
        socialnet.setImage3("socialnet3.png");
        socialnet.setImage4("socialnet4.png");

        list.pushLast(socialnet);
        Slide chess = new Slide();
        chess.setTitle("Chess.java");
        chess.setDate("2022");
        chess.setLabel1("Created a chess app using the build");
        chess.setLabel2("in program in Java with some given chess.zip files");
        chess.setLabel3("The click function, piece movement, eating");
        chess.setLabel4("piece, and checking if king is check or not");
        chess.setImage1("chess1.png");
        chess.setImage2("chess2.png");
        chess.setImage3("chess3.png");
        chess.setImage4("chess4.png");

        list.pushLast(chess);
        Slide finalproject = new Slide();
        finalproject.setTitle("ThesisCollection.java");
        finalproject.setDate("2022");
        finalproject.setLabel1("Reads a csv file using GUI");
        finalproject.setLabel2("has a login in method for admin and student");
        finalproject.setLabel3("Can add, edit, and remove data in csv file");
        finalproject.setLabel4("Can also add admin and student users");
        finalproject.setImage1("finalproject1.png");
        finalproject.setImage2("finalproject2.png");
        finalproject.setImage3("finalproject3.png");
        finalproject.setImage4("finalproject4.png");

        list.pushLast(finalproject);
        Slide work = new Slide();
        work.setTitle("Work Experience: GALILEO PH");
        work.setDate("2020");
        work.setLabel1("During Grade 11 I learned the work environment");
        work.setLabel2("inside a software service company and their past projects");
        work.setLabel3("I was also learn how to start up and propose");
        work.setLabel4("a new business to get a proper start up funds");
        work.setImage1("work1.jpg");
        work.setImage2("work2.jpg");
        work.setImage3("work3.jpg");
        work.setImage4("work4.jpg");

        list.pushLast(work);
        Slide education = new Slide();
        education.setTitle("Education and Awards");
        education.setDate("2021");
        education.setLabel1("La Salle Green Hills");
        education.setLabel2("High Honors, Exemplary Conduct Award, Loyalty Award");
        education.setLabel3("Kinder 2 to Grade 12 (2009-2021)");
        education.setLabel4("De La Salle University (2021-Present)");
        education.setImage1("education1.jpg");
        education.setImage2("education2.jpeg");
        education.setImage3("education3.jpeg");
        education.setImage4("education4.jpg");

        list.pushLast(education);
    }
}