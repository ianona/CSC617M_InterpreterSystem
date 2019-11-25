package sample;

import javafx.scene.control.TextArea;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class Interpreter {
    private Map<Key,String> TAC;
    private Stack<String> printStack = new Stack();
    private TextArea consoleArea;

    private void consoleLog(String log){
        consoleArea.appendText(log);
        consoleArea.appendText("\n");
    }

    public Interpreter(Map<Key, String> TAC, TextArea console) {
        this.TAC = TAC;
        this.consoleArea = console;
    }

    public void interpret(){
        Iterator it = TAC.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Key curKey = (Key)pair.getKey();
            String curVal = (String)pair.getValue();
            System.out.println(curKey.getName() + "--"+curVal);

            switch (curKey.getName()) {
                case "@LCall":
                    if (curVal == "_Print") {
                        consoleLog(printStack.pop());
                    }
                    break;
                case "@PushParam":
                    printStack.push(curVal);
                    break;
                default:
                    break;
            }

            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
