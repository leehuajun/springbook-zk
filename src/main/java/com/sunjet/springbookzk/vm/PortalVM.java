package com.sunjet.springbookzk.vm;

import com.sunjet.springbookzk.component.CustomButton;
import com.sunjet.springbookzk.model.Message;
import com.sunjet.springbookzk.model.PanelButton;
import com.sunjet.springbookzk.model.StatBox;
import com.sunjet.springbookzk.model.User;
import com.sunjet.springbookzk.utils.zk.ZkUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.zkoss.bind.annotation.*;
import org.zkoss.json.JSONObject;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Button;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Toolbar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
//@ToClientCommand(PortalVM.ADD_NEW_MESSAGE)
public class PortalVM {
//    public static final String ADD_NEW_MESSAGE = "addNewMessage";
//    public static final String HANDLE_PANEL_BUTTON = "handlePanelButton";
//    public static final String VIEW_DETAIL = "viewDetail";
//    @Getter
//    private ListModelList<StatBox> myStats = new ListModelList<StatBox>();
//    @Getter
//    private ListModelList<Message> myMessages = new ListModelList<Message>();
//    @Getter
//    private ListModelList<PanelButton> myPanelButtons = new ListModelList<PanelButton>();
//    @Getter
//    private String messageTextbox = "";
//    @Getter
//    private JSONObject scrollProperty = new JSONObject();
//
//    @Getter
//    private List<CustomButton> buttons = new ArrayList<>();
//
//    private int no = 0;

    @Init
    public void init() throws IOException {
//        myStats.add(new StatBox("totalVisitorClick", "TOTAL VISITORS", "3,291,922", "fa-desktop", "green"));
//        myStats.add(new StatBox("bounceRateClick", "BOUNCE RATE", "20,44%", "fa-chain-broken ", "blue"));
//        myStats.add(new StatBox("uniqueVisitorClick", "UNIQUE VISITORS", "1,291,922", "fa-users","purple"));
//        myStats.add(new StatBox("avgTimeClick", "AVG TIME ON SITE", "00:12:23", "fa-clock-o", "red"));
//
//        myMessages.add(new Message(new User("John Doe", "./img/user-5.jpg"), "Lorem ipsum dolor sit " +
//                "amet, consectetur adipiscing elit. Morbi id nunc non eros fermentum vestibulum ut id " +
//                "felis."));
//        myMessages.add(new Message(new User("Terry Ng", "./img/user-6.jpg"), "Sed in ante vel ipsum " +
//                "tristique euismod posuere eget nulla. Quisque ante sem, scelerisque iaculis interdum " +
//                "quis, eleifend id mi."));
//        myMessages.add(new Message(new User("Fiona Log", "./img/user-8.jpg"), "Pellentesque dictum in " +
//                "tortor ac blandit. Nulla rutrum eu leo vulputate ornare. Nulla a semper mi, ac lacinia " +
//                "sapien."));
//        myMessages.add(new Message(new User("John Doe", "./img/user-7.jpg"), "Morbi molestie lorem quis " +
//                "accumsan elementum. Morbi condimentum nisl iaculis, laoreet risus sed, porta neque."));
//
//        myPanelButtons.add(new PanelButton("button1", "fa-expand", "btn-default", HANDLE_PANEL_BUTTON));
//        myPanelButtons.add(new PanelButton("button2", "fa-repeat", "btn-success", HANDLE_PANEL_BUTTON));
//        myPanelButtons.add(new PanelButton("button3", "fa-minus", "btn-warning", HANDLE_PANEL_BUTTON));
//        myPanelButtons.add(new PanelButton("button4", "fa-times", "btn-danger", HANDLE_PANEL_BUTTON));

    }

    @AfterCompose
    public void afterCompose(@ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);
    }

//    @Command(VIEW_DETAIL)
//    public void viewDetail(@BindingParam("statId") String statId) {
//        Clients.showNotification(statId, null, null, null, 2000);
//    }
//
//    @Command(HANDLE_PANEL_BUTTON)
//    public void handlePanelButton(@BindingParam("buttonId") String buttonId) {
//        Clients.showNotification(buttonId, null, null, null, 2000);
//    }
//
//    @Command(ADD_NEW_MESSAGE)
//    @NotifyChange("messageTextbox")
//    public void addNewMessage() {
//        if (messageTextbox != null && !"".equals(messageTextbox)) {
//            myMessages.add(new Message(new User("John Doe", "./img/user-7.jpg"), messageTextbox));
//            messageTextbox = "";
//        }
//    }
}

