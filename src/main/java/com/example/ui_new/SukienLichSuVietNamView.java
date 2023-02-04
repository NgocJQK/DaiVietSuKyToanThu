package com.example.ui_new;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SukienLichSuVietNamView implements Initializable {

    @FXML
    public ComboBox<String> ListMusic;
    @FXML
    public Button Introl ;


    public void IntrolAction(ActionEvent event) throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Giới thiệu");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ObservableList<String> list = FXCollections.observableArrayList("Kitaro - KOI", "Kitaro - Matsuri", "Nhạc baroque không lời ", "Dòng máu lạc hồng", "Giải phóng Miền Nam", "Đoàn vệ quốc quân", "Bác đang cùng chúng cháu hành quân", "Hào khí Việt Nam");
    public void comboBoxOnAction (ActionEvent event){
        System.out.println( "Nhạc : " + ListMusic.getValue() );
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ListMusic.setItems(list);
    }
    @FXML
    // Khi nhan nut Trieu đai lich su thì hien thi man hinh tim kiem trieu dai lich su
    public Button TrieuDaiLichSu;
    public void TrieuDaiLichSuAction(ActionEvent event) throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TrieuDaiLichSu.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Triều Đại Lịch Sử");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Button HuyenSuCacViVua;
    public void HuyenSuCacViVuaAction(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HuyenSuCacViVua.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Huyền Sử Các Vị Vua");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public Button TraCuuLeHoi;
    public void TraCuuLeHoiAction(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TraCuuLeHoi.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Tra Cứu Lễ Hội");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public Button DiaDiemDiTich;
    public void DiaDiemDiTichAction(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DiaDiemDiTich.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Địa Điểm Di Tích");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // tạo ra 1 màn hình mới
    }
    @FXML
    public Button SuKienLichSuVietNam;
    public void SuKienLichSuVietNamAction(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SuKienLichSuVietNamView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Sự kiện lịch sử Việt Nam");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Button DarkMode;
    // khi ấn nút DarkMode thì đưa ra màn hình ErrorScreen
    public void DarkModeAction(ActionEvent event)  throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorScreen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Error");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Button DenVang;
    public void DenVangAction(ActionEvent event)  throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ErrorScreen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Error");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // biến tắt nhạc
    @FXML
    public Button TatNhac; // id

    // on Action
    public void TatNhacAction(ActionEvent event)  throws IOException {
        // mở ra màn hình ErrorScreen
        if(HelloApplication.mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            HelloApplication.mediaPlayer.pause();
        }else HelloApplication.mediaPlayer.play();
    }
    @FXML
    public Button NextWeb;

    public void NextWebAction(ActionEvent event) throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WebScreen.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("WebScreen");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Button GoBack;
    public void GoBackAction(ActionEvent event) throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Hello");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public Button TimKiem;
    @FXML
    public TextField Search;
    public void TimKiemAction(ActionEvent event) throws IOException {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SuKienLichSuVietNamViewData.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            stage.setTitle("Hello");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}