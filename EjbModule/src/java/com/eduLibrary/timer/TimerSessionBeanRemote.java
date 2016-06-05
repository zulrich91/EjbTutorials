/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.timer;

import javax.ejb.Remote;

/**
 *
 * @author ulrich
 */
@Remote
public interface TimerSessionBeanRemote {

    public void createTimer(long milliseconds);

}
