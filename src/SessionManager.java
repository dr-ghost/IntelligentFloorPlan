public class SessionManager{


    private List<Stage> sessionList = new ArrayList<Stage>();

    private Set<Integer> usrSet = new HashSet<Integer>();

    private int numSessions = 0;

    public void Login(ActionEvent e) throws Exception
    {
        String nm = txtUserNm.getText();
        String psswd = txtPasswd.getText();

        int usr = authenticate(nm, psswd);

        System.out.println(usr);

        if (usr != -1 && !usrSet.contains(usr)) {

            Stage primaryStage = new Stage();

            primaryStage.setOnHiding( event -> {usrSet.remove(usr);} );

            FXMLLoader loader = new FXMLLoader(getClass().getResource("customer.fxml"));;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bank_management_system", "root", "toor");

                Statement stmt = conn.createStatement();

                String query1 = "SELECT COUNT(*) FROM externaluser WHERE userid = ?;";

                PreparedStatement prep = conn.prepareStatement(query1);

                prep.setInt(1, usr);

                ResultSet rs = prep.executeQuery();

                rs.next();

                System.out.println(rs.getInt(1));

                if (rs.getInt(1) == 0)
                {
                    String query2 = "SELECT role FROM internaluser WHERE userid = ?;";

                    prep = conn.prepareStatement(query2);

                    prep.setInt(1, usr);

                    ResultSet re = prep.executeQuery();

                    re.next();

                    String role = re.getString(1);

                    System.out.println(role);

                    switch (role)
                    {
                        case "EMP":
                            loader = new FXMLLoader(getClass().getResource("employee.fxml"));
                            break;
                        case "BM":
                            loader = new FXMLLoader(getClass().getResource("bankman.fxml"));
                            break;
                    }
                }
                else
                {
                    loader = new FXMLLoader(getClass().getResource("customer.fxml"));
                }
            }
            catch (Exception f)
            {
                f.printStackTrace();
            }

            Parent root = loader.load();
            Session sess = loader.getController();

            sess.initSession(usr);
            usrSet.add(usr);

            Scene scene = new Scene(root, 1100, 700);

            primaryStage.setScene(scene);

            sessionList.add(primaryStage);

            primaryStage.show();
        }
    }

    public int authenticate(String us_nm, String psswd)
    {
        try {
            Authentication_module am = new Authentication_module();

            return am.authenticate(us_nm, psswd);
        }
        catch (Exception e)
        {
            e.printStackTrace();

            return -1;
        }

    }

}
