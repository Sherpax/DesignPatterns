package Factory.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Factory.factoryShips.EnemyShip;
import Factory.factoryShips.EnemyShipFactory;

public class EnemyShipTesting {
    public static void main(String[] args) {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        EnemyShipFactory enemyShipFactory = null;
        EnemyShip enemyShip = null;
        String enemyShipOption = "";

        enemyShipFactory = new EnemyShipFactory();
        try {
            System.out.println("What type of ship? (U / R): ");
            enemyShipOption = keyboard.readLine().trim();
            enemyShip = enemyShipFactory.makeEnemyShip(enemyShipOption);
        } catch (IOException e) {
            e.printStackTrace();
        }

        doStuffEnemy(enemyShip);

    }

    private static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
