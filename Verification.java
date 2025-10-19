public class Verification{
    int ID=250079;
    int Hashed = "Password".hashCode();
    public int pass_verify(String pass){
        if(pass.hashCode() == Hashed){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int s_id_verify(int id){
        if(id== ID){
            return 1;
        }
        else{
            return 0;
        }
    }

    public int t_id_verify(int id){
        if(id== ID){
            return 1;
        }
        else{
            return 0;
        }
    }
}


