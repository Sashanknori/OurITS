/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobCosting.ui;

import com.jobCosting.helpers.InvokerHelper;

/**
 *
 * @author Other guest
 */
public class BeginProcess {
    public static void main(String[] args) {
    InvokerHelper invokerHelper = new InvokerHelper();
    invokerHelper.doInvoke(new LoginScreen());
    }
    
}
