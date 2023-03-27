package coding;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Playlist {
    static List<Songs>  songList=new LinkedList<Songs>();
    static List<Songs>  songList1=new LinkedList<Songs>();
    static Map<String, List<Songs>> map=new HashMap<String, List<Songs>>();
    static {
        songList.add(new Songs("Naatu","Bose","RRR"));
        songList.add(new Songs("Ishq","pathan","pathan"));
        songList.add(new Songs("Zumka","Ranbir","Ranbir"));
        songList1.add(new Songs("Naatu1","Bose1","RRR1"));
        songList1.add(new Songs("Ishq1","pathan1","pathan1"));
        songList1.add(new Songs("Zumka1","Ranbir1","Ranbir1"));
        map.put("varinder", songList);
        map.put("varun", songList1);
        System.out.println(map);
    }


    public static Map<String, List<Songs>> getPlaylist(Songs songs,String userName)
    {
//Set<String> userSet=map.keySet();
        List<Songs> userSongs= map.get(userName);
        userSongs.remove(0);
        userSongs.add(songs);
        return map;

    }

    public static void main(String[] args) {
        Map<String, List<Songs>> map1=getPlaylist(new Songs("kabi kabi","adnan sami","dil wale"),"varinder");
        System.out.println(map1);
        List<Songs> varinderSongs=map1.get("varinder");
        if(varinderSongs.contains(new Songs("kabi kabi","adnan sami","dil wale")))
        {
            System.out.println("updated song is present");
        }
        else System.out.println("updated song is not present");

        Map<String, List<Songs>> map2=getPlaylist(new Songs("kabi1 kabi1","adnan sami1","dil wale1"),"varun");
        System.out.println(map2);

    }

}
