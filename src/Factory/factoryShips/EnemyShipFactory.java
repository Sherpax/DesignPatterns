package Factory.factoryShips;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {
        EnemyShip enemyShip = null;

        if (shipType.equalsIgnoreCase("U")) {
            enemyShip = new UFOEnemyShip();
        } else if (shipType.equalsIgnoreCase("R")) {
            enemyShip = new RocketEnemyShip();
        } else {
            enemyShip = new BigUFOEnemyShip();
        }

        return enemyShip;
    }

}
