class MinStack() {

    class Node(
        var data : Int ,
        var next: Node? =null
    )
    private var top : Node? = null

    fun push(x:Int) {
        val newNode = Node(x)
        newNode.next = top 
        top = newNode



    }

    fun pop() :Int? {
        if(top == null){

            return null
        }
        val value = top!!.data
        top = top!!.next
        return value

    }

    fun top(): Int? {

        return top?.data

    }

    fun getMin(): Int? {
        if(top == null )
        {
            return null
        }
         var current = top 
         var minValue = Int.MAX_VALUE
         while(current!=null)
         {
            if(current != null)
            {
                if(current.data < minValue)
                {
                    minValue = current.data
                }
                current = current.next
            }

         }
         return minValue


    }
}
