#include <jni.h>


extern "C"
JNIEXPORT jstring JNICALL
Java_com_coding_meet_apikeysecurendk_MainActivity_00024Keys_APIKey(JNIEnv *env, jobject thiz) {
    return env ->NewStringUTF("https://github.com/Coding-Meet");  /* Here Api key*/
}


extern "C"
JNIEXPORT jstring JNICALL
Java_com_coding_meet_apikeysecurendk_MainActivity_00024Keys_APIKey1(JNIEnv *env, jobject thiz) {
    return env ->NewStringUTF("Coding Meet");  /* Here Api key*/
}