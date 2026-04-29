package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class RouteDAO {
    private final String url = "jdbc:mysql://localhost:3306/logistics_db";
    private final String user = "root"; // Update with your MySQL username
    private final String pass = "password"; // Update with your MySQL password

    public void saveCheckpoint(String driverId, Checkpoint cp) {
        String sql = "INSERT INTO Checkpoints (checkpoint_id, driver_id, location_name, checkpoint_type, " +
                "distance_from_last, expected_duration, actual_duration) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cp.checkpointId);
            pstmt.setString(2, driverId);
            pstmt.setString(3, cp.locationName);
            pstmt.setString(4, cp.getType());
            pstmt.setDouble(5, cp.distanceFromLast);
            pstmt.setInt(6, cp.expectedDuration);
            pstmt.setInt(7, cp.actualDuration);
            pstmt.executeUpdate();
        } catch (SQLException e) { System.err.println("DB Error: " + e.getMessage()); }
    }
}
