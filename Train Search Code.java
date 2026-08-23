import java.sql.*;

public class TrainSearch {

    public static void search(String source, String destination) {

        String sql = "SELECT * FROM trains WHERE source=? AND destination=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, source);
            ps.setString(2, destination);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getString("train_number") + " | " +
                    rs.getString("train_name") + " | " +
                    rs.getInt("available_seats") + " seats"
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
