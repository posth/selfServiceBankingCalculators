package com.lab1marcposth.lab1_marcposth.business;

import com.lab1marcposth.lab1_marcposth.beans.User;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Marc
 */
public class UserDetailsIO {

    public synchronized void addRecord(User user, String filename) throws IOException {
        File file = new File(filename);
        try (PrintWriter out = new PrintWriter(
                new FileWriter(file, true))) {
            out.println(user.getEmail() + "|"
                    + user.getFirstName() + "|"
                    + user.getLastName());
        }
    }

}
