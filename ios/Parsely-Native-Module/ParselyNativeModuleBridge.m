#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(ParselyNativeModule, NSObject)

RCT_EXTERN_METHOD(configureWithSiteId:(NSString *))

RCT_EXTERN_METHOD(startEngagementWithURL:(NSString *))
RCT_EXTERN_METHOD(trackPageViewWithURL:(NSString *))
RCT_EXTERN_METHOD(stopEngagement)

@end
