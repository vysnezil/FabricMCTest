package sk.jurij.fabrictest;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListHandler implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
        FabricTest.index = ((JList<String>)e.getSource()).getSelectedIndex();
    }
}

