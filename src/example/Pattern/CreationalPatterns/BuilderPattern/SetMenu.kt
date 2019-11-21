package example.Pattern.CreationalPatterns.BuilderPattern

interface SetMenu {

    fun addItem(item: Item)
    fun removeItem(item: Item)
    fun  cost():Float
    fun showItems()
    fun clear()


}