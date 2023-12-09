package jenakxm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ImsMiniGame_25757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Set<String> played = new HashSet<>();
        int people = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        String player;
        while (people-- > 0) {
            player = bf.readLine().trim();
            played.add(player);
        }

        if (game.equals("Y")) {
            System.out.println(played.size());
        } else if (game.equals("F")) {
            System.out.println(Integer.valueOf(played.size() / 2));
        } else if (game.equals("O")) {
            System.out.println(Integer.valueOf(played.size() / 3));
        }
    }
}
