package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import org.controlsfx.control.StatusBar;

import java.util.ArrayList;
import java.util.List;

public class Watchstage {
    public static Watchstage instance;
    @FXML
    TableView symbolTable;
    @FXML
    TableView tempTable;
    @FXML
    VBox mainContainer;
    @FXML
    StatusBar statusBar;
    @FXML
    AnchorPane rightAnchor;
    @FXML
    TextArea watchLogArea;
    @FXML private SplitPane splitPane;
    @FXML private Label lineLbl;


    @FXML
    public void initialize(){
        instance = this;
        addColumns_st();
        addColumns_tt();
        symbolTable.prefWidthProperty().bind(mainContainer.widthProperty());
//        symbolTable.setColumnResizePolicy((param) -> true);
        tempTable.prefWidthProperty().bind(mainContainer.widthProperty());
//        tempTable.setColumnResizePolicy((param) -> true);
        splitPane.setDividerPositions(0.5);
    }

    public void updateStatus(String status){
        statusBar.setText(status);
    }

    private void addColumns_st() {
        TableColumn<Symbol, String> nameCol = new TableColumn<>("Symbol Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Symbol, String> typeCol = new TableColumn<>("Symbol Type");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<Symbol, String> dataTypeCol = new TableColumn<>("Data Type");
        dataTypeCol.setCellValueFactory(new PropertyValueFactory<>("data_type"));

        TableColumn<Symbol, Object> valueCol = new TableColumn<>("Value");
        valueCol.setCellValueFactory(new PropertyValueFactory<>("value"));
        valueCol.setCellFactory(col -> new TableCell<Symbol, Object>() {
            @Override
            protected void updateItem(Object item, boolean empty) {
                super.updateItem(item,empty);
                if (item instanceof Object[]){
                    List<Object> toDisplay = new ArrayList<>();
                    for (Object object:((Object[])item)){
                        toDisplay.add(object);
                    }
                    setText(empty ? "" : item == null ? "---" : toDisplay.toString());
                } else
                    setText(empty ? "" : item == null ? "---" : String.valueOf(item));
            }
        });

        TableColumn<Symbol, Boolean> constCol = new TableColumn<>("Constant");
        constCol.setCellValueFactory(new PropertyValueFactory<>("isConst"));
        constCol.setCellFactory(col -> new TableCell<Symbol, Boolean>() {
            @Override
            protected void updateItem(Boolean item, boolean empty) {
                super.updateItem(item, empty) ;

//                System.out.println("RAAAA!"+item+":"+empty);
                if (!empty && item != null){
                    setText(item.toString());
                } else setText(empty ? null : item == null ? null : String.valueOf(item));
            }
        });

        TableColumn<Symbol, String> scopeCol = new TableColumn<>("Scope");
        scopeCol.setCellValueFactory(new PropertyValueFactory<>("scope"));

        symbolTable.getColumns().removeAll();
        symbolTable.getColumns().addAll(nameCol,typeCol,dataTypeCol,valueCol,constCol,scopeCol);
    }

    private void addColumns_tt() {
        TableColumn<Symbol, String> nameCol = new TableColumn<>("Symbol Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Symbol, String> typeCol = new TableColumn<>("Symbol Type");
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<Symbol, String> dataTypeCol = new TableColumn<>("Data Type");
        dataTypeCol.setCellValueFactory(new PropertyValueFactory<>("data_type"));

        TableColumn<Symbol, Object> valueCol = new TableColumn<>("Value");
        valueCol.setCellValueFactory(new PropertyValueFactory<>("value"));
        valueCol.setCellFactory(col -> new TableCell<Symbol, Object>() {
            @Override
            protected void updateItem(Object item, boolean empty) {
                super.updateItem(item,empty);
                if (item instanceof Object[]){
                    List<Object> toDisplay = new ArrayList<>();
                    for (Object object:((Object[])item)){
                        toDisplay.add(object);
                    }
                    setText(empty ? "" : item == null ? "---" : toDisplay.toString());
                } else
                    setText(empty ? "" : item == null ? "---" : String.valueOf(item));
            }
        });

        TableColumn<Symbol, Boolean> constCol = new TableColumn<>("Constant");
        constCol.setCellValueFactory(new PropertyValueFactory<>("isConst"));
        constCol.setCellFactory(col -> new TableCell<Symbol, Boolean>() {
            @Override
            protected void updateItem(Boolean item, boolean empty) {
                super.updateItem(item, empty) ;
                setText(empty ? null : item == null ? null : item ? "yes" : "no" );
            }
        });

        TableColumn<Symbol, String> scopeCol = new TableColumn<>("Scope");
        scopeCol.setCellValueFactory(new PropertyValueFactory<>("scope"));

        tempTable.getColumns().removeAll();
        tempTable.getColumns().addAll(nameCol,typeCol,dataTypeCol,valueCol,constCol,scopeCol);
    }

    public void updateSymbolTable(List<Symbol> symbols){
        System.out.println("UPDATING SYMBOL TABLE");
        printTable(symbols);
        symbolTable.getItems().clear();
        symbolTable.setItems(FXCollections.observableArrayList(symbols));
    }

    public void printTable (List<Symbol> table){
        System.out.println("SymbolName \t SymbolType \t Value \t Scope \t isConst");
        for (Symbol symbol:table){
            System.out.println(symbol.getName() +
                    " \t\t " + symbol.getType() +
                    " \t\t " + symbol.getValue() +
                    " \t\t " + symbol.getScope() +
                    " \t\t " + symbol.getConst().booleanValue()
            );
        }
    }

    public void updateTempTable(List<Symbol> symbols){
        tempTable.getItems().clear();
        tempTable.setItems(FXCollections.observableArrayList(symbols));
    }

    public void consoleLog(String log){
        watchLogArea.appendText(log);
        watchLogArea.appendText("\n");
    }

    public void clearConsole(){
        watchLogArea.clear();
    }

    public void updateLineLbl(String line){
        this.lineLbl.setText(line);
    }

    public static Watchstage getInstance() {
        return instance;
    }
}
