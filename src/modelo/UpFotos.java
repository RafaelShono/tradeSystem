/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.users.FullAccount;

/**
 *
 * @author rafael
 */
public class UpFotos {
    


    private static final String ACCESS_TOKEN = "sl.AreOz-1IpY4zs838NsU3cLL6XCfDlOFQO_QweB-eWv26knLpEE6vif_3g9g2fta1fWRS-SqG95gHnM0mDKgKaIwP4ydvte9qwyUEmYCa0Gkm_5alkfo5Mxox579fW8RXldXZ1Xw";

    public static void main(String args[]) throws DbxException {
        // Create Dropbox client
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/dt2021").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
       
        FullAccount account = client.users().getCurrentAccount();
System.out.println(account.getName().getDisplayName());
        
    }
 public void teste(){
     // Get current account info

 }

}
