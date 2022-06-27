package level4.lesson4.part1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@interface AnnExample01 {
}

@Target(ElementType.TYPE)
@interface AnnExample02 {
}


@AnnExample02
class MyAnnExample01 {

}
