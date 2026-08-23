String sql =
    "INSERT INTO passengers(name, age, gender, phone) VALUES(?,?,?,?)";

try (Connection con = DBConnection.getConnection();
     PreparedStatement ps = con.prepareStatement(sql)) {

    ps.setString(1, name);
    ps.setInt(2, age);
    ps.setString(3, gender);
    ps.setString(4, phone);

    ps.executeUpdate();

    System.out.println("Passenger registered successfully.");
}
