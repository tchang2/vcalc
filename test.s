; ModuleID = 'nomain.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1

define i32 @main() nounwind uwtable {
%1 = alloca i32, align 4
store i32 0, i32* %1
  %i = alloca i32, align 4
  %t1 = alloca i32, align 4
  store i32 0, i32* %t1
  %2 = load i32* %t1, align 4

  store i32 %2, i32* %i, align 4



  %3 = load i32* %i, align 4

  %t2 = alloca i32, align 4
  store i32 2, i32* %t2
  %4 = load i32* %t2, align 4

  %t3 = icmp slt i32 %3, %4
  %5 = zext i1 %t3 to i32

  %x1 = trunc i32 %6 to i1
  br i1 %x1, label %b1, label %b2
  b1:


  %6 = load i32* %i, align 4

  %t4 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.str, i32 0, i32 0), i32 %6)

  br label %b2
  b2:


  ret i32 0
}

declare i32 @printf(i8*, ...)
