package net.ausiasmarch.connection;

public class ConnectionSettings {
    public static String getURL() {
        return "jdbc:mysql://localhost:3306/blogbuster";
    }

    public static String getUsername() {
        return "blogbuster";
    }

    public static String getPassword() {
        return "bitnami";
    }
}
