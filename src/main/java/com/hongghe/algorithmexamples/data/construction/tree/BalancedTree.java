package com.hongghe.algorithmexamples.data.construction.tree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hongghe 2018/8/25
 */
public class BalancedTree {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder(builderClassName = "Builder", toBuilder = true)
    public static class Node {
        public Integer data;
        public Integer balanceRate;
        public Node leftNode;
        public Node rightNode;
    }

    /**
     * Right rotate.
     * @param node
     */
    public void rightRotate(Node node) {
    }

    /**
     * Left rotate.
     * @param node
     */
    public void leftRotate(Node node) {

    }

    /**
     * Left left rotate
     * @param node
     */
    public static void leftLeftRotate(Node node) {

    }

    /**
     * right right rotate.
     * @param node
     */
    public static void rightRightRotate(Node node) {

    }
}
