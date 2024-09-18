#import "ParselyNativeModule.h"
#import <React/RCTLog.h>

@implementation ParselyNativeModule

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(dummyPrint:(NSString *)input)
{
  RCTLogInfo(@"Dummy print example %@", input);
}

@end
