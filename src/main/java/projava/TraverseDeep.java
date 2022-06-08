package projava;

import javax.swing.text.Position;
import java.util.ArrayDeque;

// 深さ探索なので、スタック構造を使用。
public class TraverseDeep {
    public static void main(String[] args) {
        // これが迷路
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1},
                {1, 0, 1, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };

        traverse(map, 1, 1);
        char[] ch = {'.', '*', 'G', 'o'};

        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(ch[cell]);
            }
            System.out.println();
        }

    }

    static boolean traverse(int[][] map, int curX, int curY) {
        record Position(int x, int y) {}

        // スタックを扱う為のデータ構造
        var stack = new ArrayDeque<Position>();

        stack.push(new Position(curX, curY));

        // ここの中の処理全然わかってない
        for (Position p; (p = stack.pollFirst()) != null ;) {
            switch (map[curY][curX]) {
                case 0: break;
                case 2: return true;
                default: return false;
            }
            map[p.y()][p.x()] = 3;
            stack.push(new Position(p.x() + 1, p.y()));
            stack.push(new Position(p.x() - 1, p.y()));
            stack.push(new Position(p.x(), p.y() + 1));
            stack.push(new Position(p.x(), p.y() - 1));
        }
        return false;
    }
}
