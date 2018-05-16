package myDataStructures;



public class DList {

	
	
	//**********************************************************************************************
    // Static Nested Class: Node
    //**********************************************************************************************

    /**
     * The data for each element of the DList is stored in a Node object. A Node object contains
     * three instance variables: (1) mData is a reference to the data stored in the Node; (2) mNext
     * is a reference to the succeeding Node in the DList; and (3) mPrev is a reference to the
     * preceding Node in the DList.
     *
     * Note that Node is declared as protected so it is not visible to other classes but it is
     * accessible to subclasses of DList.
     */
    protected static class Node {

        //==========================================================================================
        // Node Instance Variables
        //==========================================================================================

        /**
         * The data stored in this Node.
         */
        Integer mData;

        /**
         * A reference to the succeeding Node in the DList.
         */
        Node mNext;

        /**
         * A reference to the preceding Node in the DList.
         */
        Node mPrev;

        //==========================================================================================
        // Node Instance Methods
        //==========================================================================================

        /**
         * Creates a new Node storing no data and with mNext and mPrev set to null.
         */
        public Node() {
            this(null);
        }

        /**
         * Creates a new Node storing pData as the data and with mNext and mPrev set to null.
         */
        public Node(Integer pData) {
            setData(pData);
            setNext(null);
            setPrev(null);
        }

        /**
         * Creates a new Node storing pData as the data, mPrev initialized to pPrev, and mNext
         * initialized to pNext.
         */
        public Node(Integer pData, Node pPrev, Node pNext) {
            setData(pData);
            setPrev(pPrev);
            setNext(pNext);
        }

        /**
         * Returns true if this Node and pNode are equal to each other where equal is defined as:
         *
         * 1. If pNode is null, returns false.
         * 2. If mNode == pNode is true, returns true.
         * 3. If the instance variables of this Node are equal to the instance variables of pNode
         *    returns true.
         * 4. Otherwise, returns false.
         */
        @Override
        public boolean equals(Object pNode) {
            Node node = (Node)pNode;
            if (node == null) return false;
            if (this == node) return true;
            if (getData() == node.getData() && getNext() == node.getNext() &&
            getPrev() == node.getPrev()) return true;
            return false;
        }

        /**
         * Accessor method for the mData instance variable.
         */
        public Integer getData() {
            return mData;
        }

       /**
         * Accessor method for the mNext instance variable.
         */
        public Node getNext() {
            return mNext;
        }

       /**
         * Accessor method for the mPrev instance variable.
         */
        public Node getPrev() {
            return mPrev;
        }

        /**
         * Mutator method for the mData instance variable.
         */
        public void setData(Integer pData) {
            mData = pData;
        }

        /**
         * Mutator method for the mNext instance variable.
         */
        public void setNext(Node pNext) {
            mNext = pNext;
        }

        /**
         * Mutator method for the mPrev instance variable.
         */
        public void setPrev(Node pPrev) {
            mPrev = pPrev;
        }

        /**
         * Returns a string representation of this Node where we define the string representation
         * to be the string representation of the data stored in this Node.
         */
        @Override
        public String toString() {
            return "" + getData();
        }
    }
}
