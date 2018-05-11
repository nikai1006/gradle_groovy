//groovy 高效特性
//1 可选的类型定义
def version = 1
def group = 'cn.net.nikai'
version = 2
group = 3

//2 assert
//assert version == 2

//3 括号是可选的
println version
println(version)

//4 字符串
def s1 = 'kaini'
def s2 = "the version is ${version}"
def s3 = '''my
name is
nikai'''

println s1
println s2
println s3

//5 集合API
//list
def buildTools = ['ant', 'maven']
buildTools << "gradle"
assert buildTools.getClass() == ArrayList
assert buildTools.size() == 3

//map
def buildYears = ['ant': 2000, 'maven': 2004]
buildYears.gradle = 2009

println buildYears.ant
println buildYears['gradle']
println buildYears.getClass()
println('---------------------------------------------------------')

//6 闭包
def c1 = {
    v ->
        println v
}

def c2 = {
    println 'baby'
}

def c3 = {
    name, age ->
        println "name is ${name},age is ${age}"
}

def method1(Closure closure) {
    closure('param')
}

def method2(Closure closure) {
    closure()
}

method1(c1)
method2 c2
method1 {
    c1 'kaini'
}

method2 {
    c1 'nikai'
}
println '-----------------------------------------------------'
method2 {
    c1 'hello'
    c2 'girl'
    c3 'nikai', 20
}
println "==========================================="
c1('haha')
c1.call("xixi")
c2()
c2.call()
c2('''call
me
''')
c3('nikai', 20)
c3 'nikai', 20
c3.call('nikai', 20)