def ToSquare(i:Float) = i*i
def ToCube(i:Float) = ToSquare(i) * i

def Volume(r:Float) = 4 * ToCube(r) * java.lang.Math.PI / 3f