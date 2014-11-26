/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.time4hobby.web.tiles;

import com.time4hobby.model.UserSessionInfo;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.preparer.ViewPreparer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.tiles.AttributeContext;

/**
 *
 * @author Sindhu
 */
@Component(value = "hobbyViewPreparer")
public class HobbyViewPreparer implements ViewPreparer {

    @Autowired
    private UserSessionInfo userSessionInfo;

    public void execute(TilesRequestContext tilesRequestContext, AttributeContext attributeContext) {
    	System.out.println("HOBBY VIEW PREPARER");
        populateCommonData(tilesRequestContext);
    }

    private void populateCommonData(TilesRequestContext tilesRequestContext) {
        System.out.println("populateCommonData1: ******************" + userSessionInfo + "*******************");
        if (userSessionInfo.getUser() != null) {
            tilesRequestContext.getRequestScope().put("loggedUser", userSessionInfo.getUser());
        } else {
            tilesRequestContext.getRequestScope().put("loggedUser", "");
        }
        System.out.println("populateCommonData2: ******************" + userSessionInfo.getUser() + "*******************");
    }
}
