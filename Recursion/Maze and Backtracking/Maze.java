import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        int ans = count(3,3);
        System.out.println(ans);

        Path("",3,3);

        System.out.println(PathRet("",3,3));


        System.out.println(PathRetDiagonal("",3,3));


        boolean[][] board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        
        PathRestrictions("",board,0,0);
    }
    


    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }



    static void Path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            Path(p+"D",r-1,c);
        }
        if(c>1){
           Path(p+"R",r,c-1); 
        }      
    }




    static ArrayList<String> PathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(PathRet(p+"D",r-1,c));
        }
        if(c>1){
            ans.addAll(PathRet(p+"R",r,c-1));
        }
        
        return ans;
        
    }



    static ArrayList<String> PathRetDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1 & c>1){
            ans.addAll(PathRetDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            ans.addAll(PathRetDiagonal(p+"V",r-1,c));
        }
        if(c>1){
            ans.addAll(PathRetDiagonal(p+"H",r,c-1));
        }
        
        return ans;    
    }



    static void PathRestrictions(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            PathRestrictions(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
           PathRestrictions(p+"R",maze,r,c+1); 
        }      
    }


}