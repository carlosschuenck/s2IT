/**
 * Created by Carlos Schuenck on 22/04/2018.
 */
public class Questao9 {

    static int value = 0;

    /**
     * Realiza o somatório da arvore binaria e apresenta o resultado no console.
     * @param tree
     */
    private static void sum(BinaryTree tree) {
        value += tree.valor;
        System.out.println(value);

        if(verifyRightChild(tree))
            sum(tree.right);
        if(verifyLeftChild(tree))
            sum(tree.left);
    }

    /**
     * Método responsável por verificar o objeto tem um filho (left)
     * @param BinaryTree
     * @return boolean - Retorna true caso tiver e false caso não tiver.
     */
    private static boolean verifyLeftChild(BinaryTree tree) {
        return null != tree.left;
    }

    /**
     * Método responsável por verificar o objeto tem um filho (right)
     * @param BinaryTree
     * @return boolean - Retorna true caso tiver e false caso não tiver.
     */
    private static boolean verifyRightChild(BinaryTree tree) {
        return null != tree.right;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.valor = 50;

        BinaryTree leftA = new BinaryTree();
        leftA.valor = 10;

        BinaryTree rightB = new BinaryTree();
        rightB.valor = 5;

        tree.left = leftA;
        tree.right = rightB;

        BinaryTree leftC = new BinaryTree();
        leftC.valor = 2;

        BinaryTree rightD = new BinaryTree();
        rightD.valor = 10;

        rightB.left = leftC;
        rightB.right = rightD;

        sum(tree);
    }
}
