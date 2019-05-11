/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.max.client.raspberry;

import com.max.client.raspberry.motor.SocketComm;
import com.max.client.raspberry.ui.MainUI;
import com.max.client.raspberry.utils.SysInfo;

import javax.swing.*;

/**
 * @author jprestes
 */
public class Engine {

    public static MainUI mainUI;

    public static void main(String[] args) {
        init();

    }


    private static void init() {
        mainUI = new MainUI();
        mainUI.initView();
        mainUI.showSysInfo(SysInfo.getSysInfo());
        
        SocketComm socketComm = new SocketComm();
        socketComm.socketStart();
    }

}
