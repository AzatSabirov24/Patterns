package builder.theory

class Component private constructor(builder: Builder) {

    var param1: String? = null
    var param2: Int? = null
    var param3: Boolean? = null

//    init {
//        param1 = builder.getParam1()
//        param2 = builder.getParam2()
//        param3 = builder.getParam3()
//    }

    class Builder {

        private var param1: String? = null
//        private var param2: Int? = null
//        private var param3: Boolean? = null
        fun setParam1() = apply { param1 = param1 }
//        fun setParam2(param2: Int) = apply { this.param2 = param2 }
//        fun setParam3(param3: Boolean) = apply { this.param3 = param3 }
//        fun build() = Component(this)
//        fun getParam1() = param1
//        fun getParam2() = param2
//        fun getParam3() = param3
    }
}